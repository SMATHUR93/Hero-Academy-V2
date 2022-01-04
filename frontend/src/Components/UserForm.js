import React from "react";
import SearchMenu from "./SearchMenu";
import "./UserList.css";
// import imgTest from "../../assets/0003.jpg";
// import addFilterIcon from "../../assets/icons/filter-icon.png";
// import removeFilterIcon from "../../assets/icons/filter-remove-icon.png";
import addFilterIcon from "./filter-icon.png";
import removeFilterIcon from "./filter-remove-icon.png";

class UserForm extends React.Component {

    constructor(props){
        super(props);
        this.state = {

        }
        this.saveMethod = this.saveMethod.bind(this);
    }

    componentDidMount(prevProps, prevState, snapshot){
        console.log("I am observing !!!!");
        // this.loadDoc("/api/user", this.getUsers);
        // this.loadDoc("/academy/allInformation", this.getFilters);
    }

    render() {
        return (
            <div class="light">
                <div className="header">
                    <h2>HERO ACADEMY</h2>
                </div>

                <div className="row viewport">
                    <div className="col-9 col-s-12">
                        <div className="content">
                            <h2 id="titleBox">USER LIST</h2>
                        </div>
                    </div>
                </div>

                <div className="footer">
                    <span className="text-muted">&nbsp;&nbsp;Hero Academy version 2.0.0 May 2021.</span>
                </div>

            </div>
        );
    }

}

export default UserForm;