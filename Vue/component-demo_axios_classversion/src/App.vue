<template>
  <div id="app">
<!--    <img alt="Vue logo" src="./assets/logo.png">-->
<!--    <HelloWorld msg="Welcome to Your Vue.js App"/>-->
<!--    <movie title="名字"></movie>-->
    <Hello></Hello>
  </div>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
// import Movie from "@/components/Movie.vue";
import Hello from "@/components/Hello.vue";
import axios from 'axios'

export default {
  name: 'App',
  components: {
    // HelloWorld
    // Movie
    Hello
  },
  created:function() {
    axios.get('http://localhost:8088/user').then(response => {
      console.log(response.data)
    })
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
