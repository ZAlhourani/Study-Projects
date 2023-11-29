import axios from 'axios';

const apiLink = axios.create({
    baseURL: 'http://localhost:3000'
  });

  export default {

    getTopics() {
        return apiLink.get('/topics');
    },

    getTopic(topicId) {
        return apiLink.get(`topics/${topicId}`)
    }
  }