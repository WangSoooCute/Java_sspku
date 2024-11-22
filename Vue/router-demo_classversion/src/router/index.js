import VueRouter from 'vue-router'
import Vue from 'vue'
import Page1 from '@/components/Page1.vue'
import Page2 from '@/components/Page2.vue'

//将VueRouter设置为Vue的插件
Vue.use(VueRouter)

const router = new VueRouter({
    // 指定hash属性与组件的对应关系
    routes: [
        { path: '/page_one', component: Page1 },
        { path: '/page_two', component: Page2 },
    ]
})

export default router