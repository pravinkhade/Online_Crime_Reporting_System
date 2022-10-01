import axios from "axios";
import { useState } from "react";

const { default: UserNav } = require("../components/UserNav")

const FeedbackScreen = (props) => {

  const [addFeedback, setAddFeedback] = useState({
    feedbackType: "",
    feedbackDescription: "",
    feedbackFirstName: "",
    feedbackLastName: "",
    feedbackEmail: ""
  })

  const handleChange = (e) => {
    const name = e.target.name;
    const value = e.target.value;
    setAddFeedback({ ...addFeedback, [name]: value });
  };

  const handleSubmit = () => {
    axios.post("http://localhost:7070/user/feedback", {
      feedbackType: addFeedback.feedbackType,
      feedbackDescription: addFeedback.feedbackDescription,
      feedbackFirstName: addFeedback.feedbackFirstName,
      feedbackLastName: addFeedback.feedbackLastName,
      feedbackEmail: addFeedback.feedbackEmail
    }).then((response) => {
      alert("Feedback Submitted");
      console.log(response);
    }).catch((e) => {
      console.log(e);
    })
  }

  return (
    <div>
      <UserNav />
      <div className="vc-container">
        <h4>Feedback</h4>
      </div>

      <form class="row g-3">
        <div class="col-md-12">
          <label for="validationTextarea" class="form-label">Describe Your Feedback</label>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Comment" name="feedbackType" onClick={handleChange}/>
            <label class="form-check-label" for="inlineCheckbox1">Comments</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Suggestion" name="feedbackType" onClick={handleChange}/>
            <label class="form-check-label" for="inlineCheckbox2">Suggestions</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Question" name="feedbackType" onClick={handleChange}/>
            <label class="form-check-label" for="inlineCheckbox2">Questions</label>
          </div>
        </div>
        <div class="col-12">
          <label for="validationTextarea" class="form-label">Describe Your Feedback</label>
          <input type="text" class="form-control" id="validationTextarea" name="feedbackDescription" onChange={handleChange}/>
        </div>
        <div class="col-md-6">
          <label for="inputName4" class="form-label">First Name</label>
          <input type="text" class="form-control" id="inputName4" name="feedbackFirstName" onChange={handleChange}/>
        </div>
        <div class="col-md-6">
          <label for="inputName4" class="form-label">Last Name</label>
          <input type="text" class="form-control" id="inputName4" name="feedbackLastName" onChange={handleChange}/>
        </div>
        <div class="col-md-6">
          <label for="inputEmail4" class="form-label">Email</label>
          <input type="email" class="form-control" id="inputEmail4" name="feedbackEmail" onChange={handleChange}/>
        </div>
        <div class="col-12">
          <button type="submit" class="btn btn-primary" onClick={handleSubmit}>Submit Feedback</button>
        </div>
      </form>

    </div>

  )
}
export default FeedbackScreen