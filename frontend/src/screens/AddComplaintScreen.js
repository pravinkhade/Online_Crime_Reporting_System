import { Link } from 'react-router-dom'
const { default: UserNav } = require("../components/UserNav")

const AddComplaintScreen = (props)=> {
    // const onArticle = () => {
    //     props.history.push('/add_vehicle_complaint')
    //   }
    return (
        <div>
            <UserNav/>
            <br/><br/>
           
            <div>
                <h4>Lost & Found -:</h4>

            </div>
            <br/>
            
            <div class="w3-bar" >
            <Link to="/add_vehicle_complaint">
        <span className="navbar-brand">Vehicle</span>
      </Link>
      <Link to="/add_article_complaint">
        <span className="navbar-brand">Article</span>
      </Link>
      <Link to="/person_complaint">
        <span className="navbar-brand">Person</span>
      </Link>
           
           
          
     
      </div>
     
     
    </div>
         
    )
}

export default AddComplaintScreen