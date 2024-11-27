<template>
  <div>
    <h1>Mock.js 测试</h1>
    <p>用户信息：{{ user }}</p>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      user: null,
    };
  },
  mounted() {
    // 在组件挂载时发送 GET 请求
    axios.get("/api/user").then((response) => {
      console.log("GET 请求返回：", response.data);
      this.user = response.data.data; // 将返回的数据保存到组件状态
    });
  },
};
</script>