
import{Link} from 'react-router-dom'
// import {  useSelector } from 'react-redux'
const Navigation = (props)=> {
  
  

    return (

      
        <div>
          <div
              
              style={{
              display: "flex",
              justifyContent: "center",
              alignItems: "center",
              backgroundColor:"royalblue",
             
      }}>
         <nav class="navbar navbar-light bg-blue navbar-center">
         <span class="navbar-text">
           <center>
           <h1 class="text-center" style={{color:'white'}}>Online Crime Report System</h1>
           </center>
         

        </span>
      </nav>
    
    </div>

         
          
            
      <nav class="navbar navbar-expand navbar-dark bg-dark ">
     
        <div class="navbar-nav mr-auto">
   
      <li class="nav-item px-3">
              <Link to={"/home"} class="nav-link">
                Home
              </Link>
            </li>
            
            <div class=" navbar-collapse collapse justify-content-center order-2" id="collapsingNavbar">
            <ul class="nav navbar-nav navbar-center">
              <li class="nav-item px-4">
                <Link to={"/signin"} class="nav-link">
                  Login
                </Link>
              </li>
              
   
               <li class="nav-item px-4">
                <Link to={"/signup"} class="nav-link">
                  Sign Up
                </Link>
              </li> 
   
               <li class="nav-item px-4">
                <Link to={"/contact_us"} class="nav-link">
                 Contact Us
                </Link>
              </li> 
               <li class="nav-item px-4">
                <Link to={"/citizen_corner"} class="nav-link">
                  Citizen Corner
                </Link>
              </li> 
   
               <li class="nav-item px-4">
                <Link to={"/about_us"} class="nav-link">
                  About Us
                </Link>
              </li> 
              </ul>
             
            </div>
          </div>
          </nav>

         
        </div>
    )
}
export default Navigation