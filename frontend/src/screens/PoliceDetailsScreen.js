import { Link } from "react-router-dom"

const { default: AdminNav } = require("../components/AdminNav")

const PoliceDetailsScreen = (props)=> {
    return (
        <div>
            <AdminNav/>
            <br/>
            <h4 align="center"><u> Police Details</u></h4><br/>
            
            <Link to="/add_police">
        <span className="navbar-brand">Add Police </span>
      </Link>
     
            
            <table width="100%" cellPadding="4" cellSpacing="3">
  <br/>
  <tr  align="center">
      
  <th>Sr.No</th>
  <th>Police Details</th>
   
    
    
    <th>Update</th>
      </tr>
      <tr align="center">
        
      </tr>
      <tr align="center">
          <td>

          </td>
          
          <td>

          </td><br/>
       <button className="btn btn-success">Update</button>
      </tr>
      </table>
      
            </div>
    )
}
export default PoliceDetailsScreen