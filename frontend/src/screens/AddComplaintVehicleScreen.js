import axios from "axios";
import { useState } from "react"

const { default: UserNav } = require("../components/UserNav")

const AddComplaintVehicleScreen = (props) => {

  const [addCompVehicle, setAddCompVehicle] = useState({
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
    compPincode: ""
  })

  const handleChange = (e) => {
    const name = e.target.name;
    const value = e.target.value;
    setAddCompVehicle({ ...addCompVehicle, [name]: value });
  };

  const handleSubmit = () => {
    axios.post("http://localhost:7070/user/complaintvehicle", {
      compVehicleNo: addCompVehicle.compVehicleNo,
      compVehicleName: addCompVehicle.compVehicleName,
      compVehicleModel: addCompVehicle.compVehicleModel,
      compVehicleDescription: addCompVehicle.compVehicleDescription,
      compName: addCompVehicle.compName,
      compEmail: addCompVehicle.compEmail,
      compContact: addCompVehicle.compContact,
      compAddress: addCompVehicle.compAddress,
      compReportType: addCompVehicle.compReportType,
      compDateTime: addCompVehicle.compDateTime,
      compArea: addCompVehicle.compArea,
      compDistrict: addCompVehicle.compDistrict,
      compState: addCompVehicle.compState,
      compPincode: addCompVehicle.compPincode
    }).then((response) => {
      alert("Complaint Registered");
      console.log(response);
    }).catch((e) => {
      console.log(e);
    })
  }

  return (
    <div>
      <UserNav />
      <div className="vc-container">
        <h4>Vehicle Lost/Found</h4>
      </div>
      <form class="row g-3">

        <div class="col-md-6">
          <label for="inputName4" class="form-label">Full Name</label>
          <input type="text" class="form-control" id="inputName4" name="compName" onChange={handleChange} />
        </div>
        <div class="col-md-6">
          <label for="inputEmail4" class="form-label">Email</label>
          <input type="email" class="form-control" id="inputEmail4" name="compEmail" onChange={handleChange} />
        </div>
        <div class="col-md-6">
          <label for="inputContact4" class="form-label">Contact</label>
          <input type="contact" class="form-control" id="inputContact4" name="compContact" onChange={handleChange} />
        </div>
        <div class="col-md-6">
          <label for="inputPincode4" class="form-label">Pin Code</label>
          <input type="text" class="form-control" id="inputPincode4" name="compPincode" onChange={handleChange} />
        </div>
        <div class="col-6">
          <label for="inputAddress" class="form-label">Address</label>
          <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St" name="compAddress" onChange={handleChange} />
        </div>
        <div class="col-6">
          <label for="birthdaytime" class="form-label">Date and Time</label>
          <input type="date" class="form-control" id="birthdaytime" name="compDateTime" onChange={handleChange} />
        </div>
        <div class="col-md-6">
          <label for="inputState" class="form-label">Report Type</label>
          <select id="inputState" class="form-select" name="compReportType" onChange={handleChange}>
            <option selected>Choose...</option>
            <option>LOST</option>
            <option>FOUND</option>
          </select>
        </div>
        <div class="col-md-6">
          <label for="inputVehicleNO4" class="form-label">Vehicle No.</label>
          <input type="text" class="form-control" id="inputVehicleNO4" name="compVehicleNo" onChange={handleChange} />
        </div>
        <div class="col-md-6">
          <label for="inputVehicleName4" class="form-label">Vehicle Name</label>
          <input type="text" class="form-control" id="inputVehicleName4" name="compVehicleName" onChange={handleChange} />
        </div>
        <div class="col-md-6">
          <label for="inputVehicleName4" class="form-label">Vehicle Model</label>
          <input type="text" class="form-control" id="inputVehicleName4" name="compVehicleModel" onChange={handleChange} />
        </div>
        <div class="col-md-6">
          <label for="inputDiscription" class="form-label">Vehicle Discription</label>
          <input type="text" class="form-control" id="inputDiscription" name="compVehicleDescription" onChange={handleChange} />
        </div>
        <div class="col-md-6">
          <label for="inputCity" class="form-label">City</label>
          <input type="text" class="form-control" id="inputCity" name="compDistrict" onChange={handleChange} />
        </div>
        <div class="col-md-4">
          <label for="inputState" class="form-label">State</label>
          <select id="inputState" class="form-select" name="compState" onChange={handleChange}>
            <option selected>Maharashtra</option>
            <option>...</option>
          </select>

        </div>

        <div class="col-md-2">
          <label for="inputAddress" class="form-label">Area/Street</label>
          <input type="text" class="form-control" id="inputAddress" name="compArea" onChange={handleChange} />
        </div>
        <div class="col-12">
          <div class="form-check">
            <input class="form-check-input" type="checkbox" id="gridCheck" onClick={handleChange} />
            <label class="form-check-label" for="gridCheck">
              Check me out
            </label>
          </div>
        </div>
        <div class="col-12">
          <button type="submit" class="btn btn-primary" onClick={handleSubmit}>Submit</button>
        </div>
      </form>
    </div>
  )
}
export default AddComplaintVehicleScreen 