import React from "react";
import Avatar from "@material-ui/core/Avatar";
import Button from "@material-ui/core/Button";
import CssBaseline from "@material-ui/core/CssBaseline";
import TextField from "@material-ui/core/TextField";
import { Link } from "react-router-dom";
import Grid from "@material-ui/core/Grid";
import GroupIcon from "@material-ui/icons/Group";
import Typography from "@material-ui/core/Typography";
import { makeStyles } from "@material-ui/core/styles";
import Container from "@material-ui/core/Container";

const useStyles = makeStyles(theme => ({
  paper: {
    marginTop: theme.spacing(7),
    display: "flex",
    flexDirection: "column",
    alignItems: "center"
  },
  avatar: {
    margin: theme.spacing(1),
    backgroundColor: theme.palette.secondary.main
  },
  form: {
    width: "100%", // Fix IE 11 issue.
    marginTop: theme.spacing(3)
  },
  submit: {
    margin: theme.spacing(3, 0, 2)
  },
  textField: {
    marginLeft: theme.spacing(1),
    marginRight: theme.spacing(1),
    width: "100%"
  }
}));

export default function AddUser() {
  const classes = useStyles();
  const [firstLoad, setLoad] = React.useState(true);

  const [username, setUserName] = React.useState("");
  const [firstName, setFirstName] = React.useState("");
  const [lastName, setLastName] = React.useState("");
  const [dob, setDob] = React.useState(
    new Date("1993-02-25T21:11:54")
  );
  const [accountID, setAccountID] = React.useState("");
  const [emailID, setEmailID] = React.useState("");
  const [lastLogin, setLastLogin] = React.useState(
    new Date()
  );

  const handleUserNameChange = event => setUserName(event.target.value);
  const handleFirstNameChange = event => setFirstName(event.target.value);
  const handleLastNameChange = event => setLastName(event.target.value);
  const handleDobChange = date => setDob(date.target.value);
  const handleAccountIDChange = event => setAccountID(event.target.value);
  const handleEmailIDChange = event => setEmailID(event.target.value);
  // const handleLastLoginChange = date => setLastLogin(date.target.value);

  const [message, setMessage] = React.useState("Nothing saved in the session");

  async function sampleFunc(toInput) {
    const response = await fetch("/api/user", {
      method: "POST", // *GET, POST, PUT, DELETE, etc.
      mode: "cors", // no-cors, *cors, same-origin
      cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
      credentials: "same-origin", // include, *same-origin, omit
      headers: {
        "Content-Type": "application/json"
        // 'Content-Type': 'application/x-www-form-urlencoded',
      },
      redirect: "follow", // manual, *follow, error
      referrerPolicy: "no-referrer", // no-referrer, *client
      body: JSON.stringify(toInput) // body data type must match "Content-Type" header
    });
    let body = await response.json();
    console.log(body.id);
    setMessage(body.id ? "Data sucessfully updated" : "Data updation failed");
  }

  const handleSubmit = variables => {
    const toInput  = { username, firstName, lastName, dob : dob, accountID, emailID, lastLogin : lastLogin };
    sampleFunc(toInput);
    setUserName("");
    setFirstName("");
    setLastName("");
    setDob("");
    setAccountID("");
    setEmailID("");
    setLastLogin(new Date());
  };

  if (firstLoad) {
    // sampleFunc();
    setLoad(false);
  }

  return (
    <Container component="main" maxWidth="xs">
      <CssBaseline />
      <div className={classes.paper}>
        <Avatar className={classes.avatar}>
          <GroupIcon />
        </Avatar>
        <Typography component="h1" variant="h5">
          User Directory
        </Typography>
        <form className={classes.form} noValidate>
          <Grid container spacing={2}>
            <Grid item xs={12}>
              <TextField
                variant="outlined"
                required
                fullWidth
                id="username"
                value={username}
                label="User Name"
                name="username"
                autoComplete="userName"
                onChange={handleUserNameChange}
              />
            </Grid>
            <Grid item xs={12}>
              <TextField
                variant="outlined"
                required
                fullWidth
                id="firstName"
                value={firstName}
                label="First Name"
                name="firstName"
                autoComplete="firstName"
                onChange={handleFirstNameChange}
              />
            </Grid>
            <Grid item xs={12}>
              <TextField
                variant="outlined"
                required
                fullWidth
                id="lastName"
                value={lastName}
                label="Last Name"
                name="lastName"
                autoComplete="lastName"
                onChange={handleLastNameChange}
              />
            </Grid>
            <Grid item xs={12}>
              <TextField
                id="date"
                label="Date of birth"
                type="date"
                defaultValue="1993-02-25"
                className={classes.textField}
                InputLabelProps={{
                  shrink: true
                }}
                onChange={handleDobChange}
              />
            </Grid>
            <Grid item xs={12}>
              <TextField
                variant="outlined"
                required
                fullWidth
                id="accountID"
                value={accountID}
                label="Account ID"
                name="accountID"
                autoComplete="accountID"
                onChange={handleAccountIDChange}
              />
            </Grid>
            <Grid item xs={12}>
              <TextField
                variant="outlined"
                required
                fullWidth
                id="emailID"
                value={emailID}
                label="Email ID"
                name="emailID"
                autoComplete="emailID"
                onChange={handleEmailIDChange}
              />
            </Grid>
          </Grid>
          <Button
            // type="submit"
            fullWidth
            variant="contained"
            color="primary"
            preventDefault
            className={classes.submit}
            onClick={handleSubmit}
          >
            Save
          </Button>

          <Grid container justify="center">
            <Grid item>
              <Link to="/viewUsers">View User Records</Link>
            </Grid>
            <Grid item>
              <Link to="/searchUsers">Search Users</Link>
            </Grid>
          </Grid>
        </form>
        <Typography style={{ margin: 7 }} variant="body1">
          Status: {message}
        </Typography>
      </div>
    </Container>
  );
}