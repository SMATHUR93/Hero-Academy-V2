import React from "react";
import { makeStyles } from "@material-ui/core/styles";
import Avatar from "@material-ui/core/Avatar";
import GroupIcon from "@material-ui/icons/Group";
import { Link } from "react-router-dom";
import Typography from "@material-ui/core/Typography";
import CircularProgress from "@material-ui/core/CircularProgress";
import { DataGrid } from '@material-ui/data-grid';
import Autocomplete from '@material-ui/lab/Autocomplete';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';

const useStyles = makeStyles(theme => ({
  table: {
    minWidth: 600
  },
  avatar: {
    margin: theme.spacing(1),
    backgroundColor: theme.palette.secondary.main
  },
  paper: {
    display: "flex",
    flexDirection: "column",
    justifyContent: "center",
    alignItems: "center",
    margin: `10px`,
    height: "100%",
    width: "99%",
    marginTop: theme.spacing(7)
  },
  link: {
    color: "rgba(0,0,0,0.65)",
    textDecoration: "none",
    marginLeft: "10%",
    alignSelf: "flex-start",
    "&:hover": {
      color: "rgba(0,0,0,1)"
    }
  }
}));

const columns = [{
		field: 'id',
		headerName: 'ID',
		width: 70
	}, { 
		field: 'username',
		headerName: 'User name',
		width: 130
	}, { 
		field: 'firstName',
		headerName: 'First name',
		width: 130
	}, {
		field: 'lastName',
		headerName: 'Last name',
		width: 130
	}, {
		field: 'dob',
		headerName: 'DoB',
		type: 'date',
		width: 90
  }, { 
		field: 'accountID',
		headerName: 'accountID',
		width: 130
	}, { 
		field: 'emailID',
		headerName: 'emailID',
		width: 130
	}, { 
		field: 'lastLogin',
    headerName: 'lastLogin',
    flex: 1
	}];


export default function SearchUsers() {
  const classes = useStyles();

  const [data, upDateData] = React.useState([]);
  const [firstLoad, setLoad] = React.useState(true);
  let isLoading = true;

  async function sampleFunc() {
    let response = await fetch("/api/user");
    let body = await response.json();
    upDateData(body);
  }

  if (firstLoad) {
    sampleFunc();
    setLoad(false);
  }

  let emptyResponse = true;
  if(data && data.length==0){
    emptyResponse = true;
  }

  if (data.length > 0){
    isLoading = false;
    emptyResponse = false;
  }

  let dataLoad = React.useState("");

  // const [searchAccountIds, setSearchAccountIds] = React.useState("");
  // const handleSearchAccountIdsChange = event => setSearchAccountIds(event.target.value);

  const searchAccounts = variables => {
    // searchAccountIds;
    /* dataLoad = data.filter(node => {
      return searchAccountIds.contains(node.accountId);
    });
    setSearchAccountIds(""); */
    console.log("Call Data service again..");
  };

  return (
    <div className={classes.paper}>
      <Avatar className={classes.avatar}>
        <GroupIcon />
      </Avatar>
      <Typography component="h1" variant="h5">
        User Search
      </Typography>

      {emptyResponse ? (
        <div>
          <div><h3>Empty Response</h3></div>
          <div style={{ height: 300, width: '100%' }}>
              <DataGrid pageSize={5} rowsPerPageOptions={[5, 10, 20]} pagination rows={data} columns={columns} checkboxSelection />
            </div>
        </div>
      ) : isLoading ? (
        <CircularProgress />
      ) : (
        <div style={{ height: 450, width: '100%' }}>
          <div style={{ width: '100%', display: "flex" }}>
            <div style={{ width: '80%' }}>
              <Autocomplete
                multiple
                id="tags-standard"
                options={data}
                getOptionLabel={(option) => option.accountID}
                renderInput={(params) => (
                  <TextField
                    {...params}
                    variant="standard"
                    label="Search Account IDs"
                    placeholder="Favorites"
                  />
                )}
              />
            </div>
            <div style={{ width: '20%'}}>
              <Button color="primary" onClick={searchAccounts}>Search</Button>
            </div>
          </div>
          <div style={{ height: 400, width: '100%' }}>
            <DataGrid pageSize={5} rowsPerPageOptions={[5, 10, 20]} pagination rows={data} columns={columns} checkboxSelection />
          </div>
        </div>
      )}
      <Link className={classes.link} to="/addUser">
        {" "}
        <Typography align="left">
          &#x2190; Head back to save data
        </Typography>{" "}
      </Link>
	  <Link className={classes.link} to="/viewUsers">
        {" "}
        <Typography align="left">
          &#x2190; Head back to view users
        </Typography>{" "}
      </Link>
    </div>
  );
}