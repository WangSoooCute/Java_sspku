import Vue from "vue";
import Vuex from 'vuex'
Vue.use(Vuex)

const store = new Vuex.Store({
  state: {
    count: 0,
    todos: [
        { id: 1, text: '吃饭', done: true },
        { id: 2, text: '睡觉', done: false }
      ]
  },
  mutations: {
    increment (state,n) {
      state.count += n
    }
  },
  getters: {
    doneTodos: state => {
      return state.todos.filter(todo => todo.done)
    }
  }
})
export default store