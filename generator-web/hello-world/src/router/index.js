import Vue from "vue";
import VueRouter from "vue-router";
import home from "../views/home";
Vue.use(VueRouter);

const routes = [
  {
    name: "home",
    path: "/",
    component: home
  }, {
    name: "helloWorld",
    path: "/helloWorld",
    component: () => import("../views/hello-world")
  }, {
    name: "login",
    path: "/login",
    component: () => import("../views/login")
  }
];

const router = new VueRouter({
  routes
});

export default router;
