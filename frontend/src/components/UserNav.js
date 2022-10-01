
import { Link } from 'react-router-dom'
const UserNav = (props) => {
  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <div className="container-fluid">
        <Link to="/add_complaint">
          <span className="navbar-brand">Add Complaint</span>
        </Link>
        <Link to="/view_complaint_status">
          <span className="navbar-brand"> View_Complaint_Status</span>
        </Link>
        <Link to="/Update_info">
          <span className="navbar-brand">Update_info</span>
        </Link>
        <Link to="/Feedback">
          <span className="navbar-brand">Feedback</span>
        </Link>
        <Link to="/logout">
          <span className="navbar-brand">Logout</span>
        </Link>

      </div>
    </nav>
  )
}
export default UserNav