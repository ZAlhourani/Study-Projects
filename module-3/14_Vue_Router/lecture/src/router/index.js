import { createRouter as _createRouter, createWebHistory } from 'vue-router';
import ProductView from '@/views/ProductsView.vue';
import ProductDetails from '@/views/ProductDetails.vue';
import AddReviewView from '@/views/AddReviewView.vue';
const routes = [

  {
    name: 'home-page',
    path: '/',
    component: ProductView
  },

  {
    name: 'product-details',
    path: '/products/:id', // : made the id as variable 
    component: ProductDetails
  },

  {
    name: 'add-review',
    path: '/products/:id/reviews/create',
    component: AddReviewView
  }

];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
