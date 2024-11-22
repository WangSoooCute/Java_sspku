<template>
    <h1>{{message}}</h1> 
    <button @click="fun">点击</button> 
</template>

<script>
export default{
    name:"Hello",
    components:{
    },
    data:function(){
        return {
            message:"hello world"
        }
    },
    methods:{
        fun(){
            alert("hello")
        }
    }
}
</script>

<style>
h1{
    color: red;
}
</style>