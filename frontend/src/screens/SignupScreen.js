
import { Link  } from 'react-router-dom'
import{signup} from '../actions/userActions'
import { useState , useEffect} from 'react'
import { useDispatch , useSelector} from 'react-redux'
//import store from '../store'

const SignupScreen = (props)=> {

    const [userFirstName,setFirstname] = useState('') 
    const [userLastName,setLastName] = useState('') 
    const [userEmail,setEmail] = useState('') 
    const [userContact,setContact] = useState('') 
    const [userPassword,setPassword] = useState('') 
    
    const dispatch = useDispatch()

    const userSignup= useSelector((store)=> store.userSignup)
    const {loading, response, error} = userSignup
    
    useEffect(() => {
        // console.log('use effect called:')
        // console.log('loading: ', loading)
        // console.log('response:', response)
        // console.log('error:', error)
        

        if (response && response.status === 'success') {
            // user successfully got registered
           props.history.push('/signin')
           
           //return <Redirect to='/signin' />
          } else if (error) {
            // there is an error while making the API call
            console.log(error)
            alert('error while making API call')
          }
        }, [loading, response, error])
    const onSignup =() => {
        // console.log('first name ', userFirstName)
        // console.log('last name ', userLasttName)
        // console.log('email ', userEmail)
        // console.log('contact ', userContact)
        // console.log('password ', userPassword)

        dispatch(signup(userFirstName, userLastName, userEmail, userContact, userPassword))
    }
    return (
        <div className="col-md-12">
        <div className="card card-container">
          <img
            src="//ssl.gstatic.com/accounts/ui/avatar_2x.png"
            alt="profile-img"
            className="profile-img-card"
          />
           <div className="form">
        <div className="mb-3">
          <label className="form-label">First Name</label>
          <input
            onChange={(e) => {
                setFirstname(e.target.value)
            }}
            className="form-control"></input>
        </div>
        <div className="mb-3">
          <label className="form-label">Last Name</label>
          <input
            onChange={(e) => {
              setLastName(e.target.value)
            }}
            className="form-control"></input>
        </div>
        <div className="mb-3">
          <label className="form-label">Email</label>
          <input
            onChange={(e) => {
              setEmail(e.target.value)
            }}
            type="email"
            className="form-control"
            placeholder="test@test.com"
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Contact</label>
          <input
            onChange={(e) => {
                setContact(e.target.value)
            }}
            type="text"
            className="form-control"
            
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Password</label>
          <input
            onChange={(e) => {
              setPassword(e.target.value)
            }}
            type="password"
            className="form-control"
            placeholder="*****"></input>
        </div>
        <div className="mb-3">
          <button  onClick={onSignup} className="btn btn-success">
            Singup
          </button>
          <div className="float-end">
            Existing user? <Link to="/signin">Signin here</Link>
          </div>
        </div>
      </div>

        </div>
        {
            userSignup.loading &&
            <div>waiting for result</div>
        }
       
        </div>
    )
}

export default SignupScreen 