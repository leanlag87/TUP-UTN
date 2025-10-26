import api from "./api";

// export const createTasksRequest = async (task) => {
//   try {
//     const response = await api.post("/tasks", task);
//     return response.data;
//   } catch (error) {
//     console.error(error);
//   }
// };

export const createTasksRequest = async (task) => {
  await api.post("/tasks", task);
};
