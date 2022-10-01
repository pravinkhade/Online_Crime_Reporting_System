import axios from "axios"
import { useEffect, useState } from "react"
import PoliceNav from "../components/PoliceNav"

const PoliceHomeScreen = (props)=> {
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
    compVehicleId: ""
    // status: ""
  }])

  useEffect(() => {

    axios.get("http://localhost:7070/user/viewcompVehicle", {}).then((response) => {
      setCompVehicle(response.data)
      console.log(response.data);

    }).catch((e) => {
      console.log(e);
    })
  }, [])

  const updateCompStatus = (id, status) => {
    axios.put(`http://localhost:7070/police/update_complaint_status?complaintId=${id}&status=${status}`, {}).then((response) => {
      compVehicle.status = status;
      console.log(response.data);

    }).catch((e) => {
      console.log(e);
    })
  }

  return (
    <>
    <div>

      <PoliceNav />
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
            <th>Action</th>
          </tr></thead>
        <tbody>
          {
            compVehicle.map(
              (c, id) => {
                return (<><tr align="center" key={id}>
                  <td>{c.compVehicleId}</td>
                  <td>{c.compName}</td>
                  <td>{c.compEmail}</td>
                  <td>{c.compReportType}</td>
                  <td>{c.compVehicleDescription}</td>
                  <td>{c.status}</td>
                  <td>
                  <button className="btn btn-md btn-primary" onClick={() => window.location.assign(`/complaint/${c.compVehicleId}`)}>View</button>
                  </td>
                </tr>
                </>)
              }
            )
          }
        </tbody>
      </table>
    </div>
    </>
  )

}

export default PoliceHomeScreen 