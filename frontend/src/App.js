import React, { Component } from 'react';
import './App.css';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import Button from '@material-ui/core/Button';
import SaveIcon from '@material-ui/icons/Save';
import api from './services/api';

class App extends Component {

  constructor(props) {
    super(props)
    this.state = {
      lessons: []
    }

    this.getData = this.getData.bind(this)
  }

  getData() {
    console.log("Getting data...")
    api.get(`lesson/`)
      .then(res => {
        this.setState({ lessons: res.data })
      }, err => {
        alert("Error:" + err)
    })
  }

  render() {
    return (
      <div>
        <Paper>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell>Lesson ID</TableCell>
                <TableCell>Lesson Name</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {this.state.lessons.map((lesson) => (
                <TableRow key={lesson.id}>
                  <TableCell>
                    {lesson.id}
                  </TableCell>
                  <TableCell>
                    {lesson.name}
                  </TableCell>
                </TableRow>
              ))}
            </TableBody>
          </Table>
        </Paper>
        <Button style={{ marginTop: 20, marginLeft: 'auto', marginRight: 'auto', display: 'block' }} variant="contained" color="primary" onClick={this.getData}>
          <SaveIcon />
        </Button>
      </div>
    )
  }
}

export default App;
