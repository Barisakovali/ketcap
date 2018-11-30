import React, { Component } from 'react';
import { Link } from 'react-router-dom';

import * as ROUTES from '../../routes';
import {
  Button,
  Divider,
  Grid,
  Header,
  Segment,
  Form,
  Image
} from 'semantic-ui-react';
import 'semantic-ui-css/semantic.min.css';
import './Login.css';
import TEACHER from '../../resources/teacher-logo.svg';

class TeacherLogin extends Component {
  render() {
    return (
      <Segment placeholder>
        <Grid columns={2} stackable textAlign="center">
          <Divider vertical>Or</Divider>
          <Grid.Row verticalAlign="middle">
            <Grid.Column>
              <Header as="h2" textAlign="center">
                <Image src={TEACHER} /> LOGIN AS TEACHER
              </Header>
              <Form className="login-form">
                <Segment padded="very" color="yellow">
                  <Form.Input
                    fluid
                    icon="user"
                    iconPosition="left"
                    placeholder="E-mail address"
                  />
                  <Form.Input
                    fluid
                    icon="lock"
                    iconPosition="left"
                    placeholder="Password"
                    type="password"
                  />

                  <Button color="yellow" fluid size="large">
                    Login
                  </Button>
                </Segment>
              </Form>
            </Grid.Column>
            <Grid.Column>
              <Header as="h2" textAlign="center" />
              <Button.Group vertical size="huge">
                <Button fluid color="orange">
                  <Link to={ROUTES.STUDENT_LOGIN}>Login as Student</Link>
                </Button>

                <Button fluid color="blue">
                  <Link to={ROUTES.PARENT_LOGIN}>Login as Parent</Link>
                </Button>
              </Button.Group>
            </Grid.Column>
          </Grid.Row>
        </Grid>
      </Segment>
    );
  }
}

export default TeacherLogin;
