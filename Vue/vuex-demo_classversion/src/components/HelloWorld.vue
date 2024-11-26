<template>
  <div class="hello">
    <button @click="increment">+1</button>
    <p>{{ $store.state.count }}</p>
  </div>
</template>

<script>
import { mapMutations } from 'vuex'

export default {
  name: 'HelloWorld',
  methods: {//在export default里面
    ...mapMutations(['increment'])
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
