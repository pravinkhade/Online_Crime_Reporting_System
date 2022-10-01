import AdminNav from "../components/AdminNav"

const SearchRecordAdminScreen = (props)=> {
    return (
        <div>
           <AdminNav/><br/>
           <h4 align="center"><u> Search Records</u></h4><br/>
           <form class="d-flex">
               
        <input class="form-control me-2" type="search" placeholder="Email" aria-label="Search"/>
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
      <br/>

      
           </div>
    )
}
export default SearchRecordAdminScreen