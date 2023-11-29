<template>
  <section>
    <div class="card" :class="{ read: book.read}">
    <h2 class="book-title">{{ book.title }}</h2>
    <img class="book-image" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" alt="book image">
    <h3 class="book-author">{{book.author}}</h3>
    <button :class="{'mark-read':!book.read,'mark-unread':book.read}" v-on:click="buttonChange">{{ !book.read ? 'Mark Read' : 'Mark Unread' }} </button> 
  </div>
  
  </section>
  
</template>
<script>
import { readonly } from 'vue';
export default {
  props: ['book'],
  methods: {
    buttonChange() {
      this.$store.commit('READ_UNREAD', this.book) 
    }
  }
  
}
</script>
<style>
.card {
  border: 2px solid black;
  border-radius: 10px;
  width: 250px;
  height: 550px;
  margin: 20px;
  position: relative;
}
.card.read {
  background-color: lightgray;
}
.card .book-title {
  font-size: 1.5rem;
}
.card .book-author {
  font-size: 1rem;
}
.book-image {
  width: 80%;
}
.mark-read, .mark-unread {
  display: block;
  position: absolute;
  bottom: 40px;
  width: 80%;
  left: 10%;
  font-size: 1rem;
}
</style>

<!-- <template>
  <div class="card">

  </div>
</template>

<script>
export default {

}
</script>

<style>
.card {
  border: 2px solid black;
  border-radius: 10px;
  width: 250px;
  height: 550px;
  margin: 20px;
  position: relative;
}

.card.read {
  background-color: lightgray;
}

.card .book-title {
  font-size: 1.5rem;
}

.card .book-author {
  font-size: 1rem;
}

.book-image {
  width: 80%;
}

.mark-read, .mark-unread {
  display: block;
  position: absolute;
  bottom: 40px;
  width: 80%;
  left: 10%;
  font-size: 1rem;
}
</style> -->