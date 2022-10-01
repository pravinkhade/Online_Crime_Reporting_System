const { default: PoliceNav } = require("../components/PoliceNav")

const SolvedComplaintsScreen = (props)=> {
    return (
        <div>
          <PoliceNav/>
          <h4 align="center"><u> Annual Complaints</u></h4><br/>
            <table width="100%" cellPadding="4" cellSpacing="3">
  <tr  align="center">
  <th>Sr.No</th>
  <th>  Applicant Name</th>
    <th>Solved</th>
    <th>Details</th>
    
      </tr>
      <tr align="center">
       
      </tr>
      </table>
           </div>
    )
}
export default SolvedComplaintsScreen