import { Link } from 'react-router-dom'
const AdminNav= (props)=> {
   return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
    <div className="container-fluid">
    <Link to="/police_details">
        <span className="navbar-brand">Police Details</span>
      </Link>
      <Link to="/annual_report">
        <span className="navbar-brand">Annual Report</span>
      </Link>
      <Link to="/view_feedback">
        <span className="navbar-brand">View Feedback</span>
      </Link>
      <Link to="/asolved_complaints">
        <span className="navbar-brand"> Solved Complaints</span>
      </Link>
      <Link to="/a_search">
        <span className="navbar-brand">Search Record</span>
      </Link>
      
      <Link to="/signin">
        <span className="navbar-brand">Logout</span>
      </Link>
     
      

      </div>
      </nav>
   )
}
export default AdminNav