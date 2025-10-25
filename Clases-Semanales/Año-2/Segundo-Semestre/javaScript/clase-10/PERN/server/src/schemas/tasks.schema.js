import { z } from "zod";

export const createTaskSchema = z.object({
  title: z
    .string()
    .min(3, { message: "El título debe tener al menos 3 caracteres" })
    .max(50, { message: "El título no puede exceder los 50 caracteres" }),
  description: z
    .string()
    .min(10, { message: "La descripción debe tener al menos 10 caracteres" })
    .max(255, {
      message: "La descripción no puede exceder los 255 caracteres",
    }),
});
