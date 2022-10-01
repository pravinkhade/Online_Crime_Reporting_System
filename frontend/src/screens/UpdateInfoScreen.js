const { default: UserNav } = require("../components/UserNav")

const UpdateInfoScreen = (props) => {
    return (
    <div>
        <UserNav/>
        <h4 align="center"><u> Update Info.</u></h4><br/>
            <table width="100%" cellPadding="4" cellSpacing="3">
  <tr  align="center">
  <th>Sr.No</th>
  <th>Applicant Name</th>
    <th>Email</th>
    <th>Lost/Found</th>
    <th>Description</th>
    <th>Update</th>
      </tr>
      <tr align="center">
       
      </tr>
      </table>
    </div>
        

    )
}
export default UpdateInfoScreen