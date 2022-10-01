import AdminNav from "../components/AdminNav"


const AddPoliceScreen = (props)=> {
    return (
        <div>
            <AdminNav/>
            <br/>
            <h4 align="center"><u>Add Police </u></h4><br/>
            <form>
  <div class="mb-3">
    <label for="exampleInputName1" class="form-label">Name</label>
    <input type="email" class="form-control" id="exampleInputName1" aria-describedby="emailHelp"/>
    
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email </label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
    
  </div>
  <div class="mb-3">
    <label for="exampleInputText1" class="form-label">Status</label>
    <input type="email" class="form-control" id="exampleInputText1" aria-describedby="emailHelp"/>
    
  </div>
  <div class="col-3">
  <label for="birthdaytime" class="form-label">Date and Time</label>
  <input type="datetime-local" class="form-control" id="birthdaytime" name="birthdaytime"/>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1"/>
  </div>
  
  <button type="submit" class="btn btn-primary">Add Police</button>
</form>
            </div>
    )
}
export default AddPoliceScreen