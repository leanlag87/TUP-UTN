import { z } from "zod";

export const createTaskSchema = z.object({
  title: z
    .string()
    .min(3, { message: "El título debe tener al menos 3 caracteres" }),
  description: z
    .string()
    .min(10, { message: "La descripción debe tener al menos 10 caracteres" }),
});
