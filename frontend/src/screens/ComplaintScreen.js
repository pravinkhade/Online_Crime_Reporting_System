import axios from "axios"
import { useParams } from 'react-router-dom';
import { useEffect, useState } from "react"
import PoliceNav from "../components/PoliceNav"

export default function ComplaintScreen() {

  const { id } = useParams();

    const [compVehicle, setCompVehicle] = useState({
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
    })
  
    useEffect(() => {
  
      axios.get(`http://localhost:7070/police/getVehicleComplaint?id=${id}`, {}).then((response) => {
        setCompVehicle(response.data.result)
        console.log(response.data.result);
  
      }).catch((e) => {
        console.log(e);
      })
    }, [])
  
    const updateCompStatus = (id, status) => {
      axios.put(`http://localhost:7070/police/update_complaint_status?complaintId=${id}&status=${status}`, {}).then((response) => {
        compVehicle.status = status;
        console.log(response.data.result);
  
      }).catch((e) => {
        console.log(e);
      })
    }
  
    return (
      <>
      <div>
  
        <PoliceNav />
        <h4 align="center"><u> Complaint Status</u></h4><br />
        <table>
          <tbody>
            <tr>
              <td><b>Name:</b></td>
              <td>{compVehicle.compName}</td>
            </tr>
            <tr>
              <td><b>Email:</b></td>
              <td>{compVehicle.compEmail}</td>
            </tr>
            <tr>
              <td><b>Address:</b></td>
              <td>{compVehicle.compAddress}</td>
            </tr>
            <tr>
              <td><b>Area:</b></td>
              <td>{compVehicle.compArea}</td>
            </tr>
            <tr>
              <td><b>Status:</b></td>
              <td>
                <select onChange={(event) => updateCompStatus(compVehicle.compVehicleId, event.target.value)}>
                  <option value="INVESTIGATING" selected={compVehicle.status == "INVESTIGATING"}>INVESTIGATING</option>
                  <option value="NOT_YET_STARTED" selected={compVehicle.status == "NOT_YET_STARTED"}>NOT_YET_STARTED</option>
                  <option value="INVESTIGATION_COMPLETED" selected={compVehicle.status == "INVESTIGATION_COMPLETED"}>INVESTIGATION_COMPLETED</option>
                </select>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      </>
    )
}