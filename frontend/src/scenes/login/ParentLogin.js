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
import PARENT from '../../resources/parent-logo.svg';

class StudentLogin extends Component {
  render() {
    return (
      <Segment placeholder>
        <Grid columns={2} stackable textAlign="center">
          <Divider vertical>Or</Divider>
          <Grid.Row verticalAlign="middle">
            <Grid.Column>
              <Header as="h2" textAlign="center">
                <Image src={PARENT} /> LOGIN AS STUDENT
              </Header>
              <Form className="login-form">
                <Segment padded="very" color="blue">
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

                  <Button color="blue" fluid size="large">
                    Login
                  </Button>
                </Segment>
              </Form>
            </Grid.Column>
            <Grid.Column>
              <Header as="h2" textAlign="center" />
              <Button.Group vertical size="huge">
                <Button fluid color="yellow">
                  <Link to={ROUTES.TEACHER_LOGIN}>Login as Teacher</Link>
                </Button>

                <Button fluid color="orange">
                  <Link to={ROUTES.STUDENT_LOGIN}>Login as Student</Link>
                </Button>
              </Button.Group>
            </Grid.Column>
          </Grid.Row>
        </Grid>
      </Segment>
    );
  }
}

export default StudentLogin;
