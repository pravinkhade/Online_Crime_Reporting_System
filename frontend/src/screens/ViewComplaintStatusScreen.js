import axios from "axios"
import { useEffect, useState } from "react"
import UserNav from "../components/UserNav"

const ViewComplaintStatusScreen = () => {

  const [compVehicle, setCompVehicle] = useState([{
    compVehicleNo: "",
    compVehicleName: "",
    compVehicleModel: "",
    compVehicleDescription: "",
    compName: "",
    compEmail: "",
    compContact: "",
    compAddress: "",
    compReportType: "",
    compDateTime: "",
    compArea: "",
    compDistrict: "",
    compState: "",
    compPincode: "",
    compVehicleId: "",
    status: ""
  }])

  useEffect(() => {

    axios.get("http://localhost:7070/user/viewcompVehicle", {}).then((response) => {
      setCompVehicle(response.data)
      console.log(response.data);

    }).catch((e) => {
      console.log(e);
    })
  }, [])

  return (

    <div>

      <UserNav />
      <h4 align="center"><u> Complaint Status</u></h4><br />
      <table width="100%" cellPadding="4" cellSpacing="3">
        <thead>
          <tr align="center">
            <th>Sr.No</th>
            <th>Applicant Name</th>
            <th>Email</th>
            <th>LOST/FOUND</th>
            <th>Description</th>
            <th>Status</th>
          </tr></thead>
        <tbody>
          {
            compVehicle.map(
              (c, id) => {
                return (<tr align="center" key={id}>
                  <td>{c.compVehicleId}</td>
                  <td>{c.compName}</td>
                  <td>{c.compEmail}</td>
                  <td>{c.compReportType}</td>
                  <td>{c.compVehicleDescription}</td>
                  <td>{c.status}</td>
                </tr>)
              }
            )
          }
        </tbody>
      </table>
    </div>
  )

}
export default ViewComplaintStatusScreen