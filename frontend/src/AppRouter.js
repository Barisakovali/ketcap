import React from 'react';
import { Switch, Route, Redirect } from 'react-router-dom';
import * as ROUTES from './routes';
import StudentLogin from './scenes/login/StudentLogin';
import TeacherLogin from './scenes/login/TeacherLogin';
import ParentLogin from './scenes/login/ParentLogin';
import Student from './scenes/student/Student';

const AppRouter = () => (
  <Switch>
    <Route
      exact
      path="/"
      render={() => <Redirect replace to={ROUTES.STUDENT_LOGIN} />}
    />
    <Route exact path={ROUTES.STUDENT_LOGIN} component={StudentLogin} />
    <Route exact path={ROUTES.TEACHER_LOGIN} component={TeacherLogin} />
    <Route exact path={ROUTES.PARENT_LOGIN} component={ParentLogin} />
    <Route exact path={ROUTES.STUDENT_DASHBOARD} component={Student} />
  </Switch>
);

export default AppRouter;
