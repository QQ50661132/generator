<template>
  <div id="app">
    <h1>Hello App!</h1>
    <router-link to="/helloWorld">
      <el-button>go hello world</el-button>
    </router-link>
    <router-link to="/login">
      <el-button>go login page</el-button>
    </router-link>
    <router-link to="/">
      <el-button>go home</el-button>
    </router-link>
    <router-view></router-view>
  </div>
</template>

<script>
import VueRouter from "vue-router";

export default {
  name: "app",
  VueRouter,
  components: {

  }
}
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
