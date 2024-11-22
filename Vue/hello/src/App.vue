<template>
  <Hello v-for="movie in movies" :key="movie.id" :title="movie.title" :rating="movie.rating"></Hello>
  <el-date-picker
        v-model="value1"
        type="date"
        placeholder="Pick a day"
        :size="size"
      />
</template>

<script>
import Hello from './components/Hello.vue'
export default {
  name: 'App',
  data:function(){
    return {
      movies:[
        {id:1,title:"电影1",rating:8.7},
        {id:2,title:"电影1",rating:8.7},
        {id:3,title:"电影1",rating:8.7},
      ]
    }
  },
  components: {
    Hello
},

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
