<template>
  <div>Bot Name: {{bot_name}}</div>
  <div>Bot Rating: {{bot_rating}}</div>
  <router-view />
</template>

<style>
</style>

<script>
  import { ref } from "vue";
  export default {
    name: "App",
    setup() {
      let bot_name = ref("Loading...");
      let bot_rating = ref("Loading...");
      fetch("http://localhost:3000/bots")
        .then(res => res.json())
        .then(data => {
          console.log(data);
          bot_name.value = data.name;
          bot_rating.value = data.rating;
        });
        return {
          bot_name,
          bot_rating
        }
      }
  }
</script>


