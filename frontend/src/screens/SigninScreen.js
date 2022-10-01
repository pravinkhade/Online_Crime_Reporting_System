import { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import { signin } from '../actions/userActions'
import { useDispatch, useSelector } from 'react-redux'





const SigninScreen = (props) => {
  const [userEmail, setEmail] = useState('')
  const [userPassword, setPassword] = useState('')
  const [type, setType] = useState('')

  const userSignin = useSelector((store) => store.userSignin)
  const { loading, error, response } = userSignin

  const dispatch = useDispatch()
  const onSignin = () => {
    dispatch(signin(userEmail, userPassword, type))
  }

  useEffect(() => {
    if (response && response.status === 'success') {
      sessionStorage.setItem('token', response.data.token)
      props.history.push('/user_home')
    } else if (response && response.status === 'error') {
      alert(response.error)
    } else if (error) {
      alert(error)
    }
  }, [loading, error, response])

  return (

    <div className="col-md-12">

      <div className="card card-container">
        <img
          src="//ssl.gstatic.com/accounts/ui/avatar_2x.png"
          alt="profile-img"
          className="profile-img-card"
        />
        <div>
          <div  onChange={(e) => {
                  setType(e.target.value)
                }} style={{display:"flex"}}>
            <input style={{alignSelf:"center"}} type="radio" id="html" name="type" value="user" />&nbsp;
            <label style={{marginTop:"0px"}} for="html">User</label>&nbsp;&nbsp;
            <input style={{alignSelf:"center"}} type="radio" id="css" name="type" value="police" />&nbsp;
            <label style={{marginTop:"0px"}} for="css">Police</label>&nbsp;&nbsp;
            <input style={{alignSelf:"center"}} type="radio" id="javascript" name="type" value="admin" />&nbsp;
            <label style={{marginTop:"0px"}} for="javascript">Admin</label>
          </div>
          <div className="form">
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
              <button onClick={onSignin} className="btn btn-success">
                Sign In
              </button>
              <div className="float-end">
                New User? <br /><Link to="/signup">Signup here</Link>
              </div>
            </div>
          </div>
          {loading && <div>waiting for response</div>}
        </div>
      </div>
    </div>
  )
}

export default SigninScreen 