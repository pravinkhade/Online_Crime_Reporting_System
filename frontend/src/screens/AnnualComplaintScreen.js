const { default: PoliceNav } = require("../components/PoliceNav")

const AnnualComplaintScreen = (props)=> {
    return (
        <div>
           <PoliceNav/>
           <h4 align="center"><u> Annual Complaints</u></h4><br/>
            <table width="100%" cellPadding="4" cellSpacing="3">
  <tr  align="center">
  <th>Year</th>
  <th> Total Cases</th>
    <th>Solved</th>
    <th>Pending</th>
    
      </tr>
      <tr align="center">
       
      </tr>
      </table>
        </div>
    )
}

export default AnnualComplaintScreen