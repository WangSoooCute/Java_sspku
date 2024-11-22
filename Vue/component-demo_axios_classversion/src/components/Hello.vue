<template>
  <el-table
      :data="tableData"
      style="width: 100%">
    <el-table-column
        prop="id"
        label="编号"
        width="180">
    </el-table-column>
    <el-table-column
        prop="username"
        label="用户名"
        width="180">
    </el-table-column>
    <el-table-column
        prop="birthday"
        label="生日">
    </el-table-column>
  </el-table>
</template>

<script>
import axios from 'axios'//写在&lt;script&gt;里面

export default {
  created:function() {//写在export default里面
    axios.get('http://localhost:8088/user').then(response => {
      this.tableData=response.data
    })
  },
  data() {
    return {
      tableData: []
    }
  }
}
</script>