import AdminNav from "../components/AdminNav"


const AdminHomeScreen = (props)=> {
    return (
        <div>
            <AdminNav/>
            <h4 align="center"><u> Complaints</u></h4><br/>
            <table width="100%" cellPadding="4" cellSpacing="3">
  <tr  align="center">
  <th>Sr.No</th>
  <th>Applicant Name</th>
    <th>Email</th>
    
    
    <th>View Complaint</th>
      </tr>
      <tr align="center">
        
      </tr>
      <tr align="center">
          <td>

          </td>
          <td>

          </td>
          <td>

          </td><br/>
       <button className="btn btn-success">View</button>
      </tr>
      </table>
        </div>
    )
}

export default AdminHomeScreen 