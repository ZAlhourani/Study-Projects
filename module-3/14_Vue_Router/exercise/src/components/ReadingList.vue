<template>
  <div class="book-container">
    <router-link to="">
      <book-card v-bind:book="book" v-for="book in $store.state.books" v-bind:key="book.isbn" />
    </router-link>
  </div>
</template>

<script>
import BookCard from '../components/BookCard.vue';

export default {
  components: {
    BookCard
  }
}
</script>

<style>
.book-container {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
}
</style>