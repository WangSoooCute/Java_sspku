import Vue from 'vue'
import App from './App.vue'
import store from './store'

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  store: store //挂载store，写在new Vue()里面
}).$mount('#app')
