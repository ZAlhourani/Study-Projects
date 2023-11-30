import { createRouter as _createRouter, createWebHistory } from 'vue-router';
import HomeView from '@/views/HomeView.vue';
import MyBooksView from '@/views/MyBooksView.vue';
import NewBookView from'@/views/NewBookView.vue'

const routes = [

  {
    name: 'home-view',
    path: '/',
    component: HomeView
  },

  {
    name: 'my-books-view',
    path: '/myBooks',
    component: MyBooksView
  },

  {
    name: 'new-book-view',
    path: '/addBook',
    component: NewBookView
  }



];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
