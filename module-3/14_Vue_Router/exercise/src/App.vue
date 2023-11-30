<template>
  <div id="book-app">

    <div>
    <nav>
      <router-link :to="{ name: 'home-view' }">Home</router-link>
                |
      <router-link :to="{ name: 'my-books-view' }">My Books</router-link>
     </nav>
    </div>

    <router-view />
  </div>
</template>

<script>

export default {
  
}
</script>

<style>
#book-app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}
</style>
