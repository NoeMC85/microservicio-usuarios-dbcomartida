# Sistema de Administración de Exámenes

## Arquitectura
- **API Gateway**: Puerto 8099
- **Servicio Usuarios**: Puerto 8088
- 
## Requisitos
- Base de datos MariaDB


## Configuración rápido
1. Clonar repo
2. Copiar `.env.example` a `.env` y ajustar valores
3. Ejecutar `docker-compose up -d`

## Endpoints principales
| Método   |                 Endpoint             |       Descripción              |
|----------|--------------------------------------|--------------------------------|
| POST     | /auth/login                          | Autenticación                  |
| GET      | /api/alumnos                         | Listar alumnos                 |
| GET      | api/alumnos/uploads/img/13           | Listar alumno con imagen       |
| GET      | /api/alumnos/pagina?page=0&size=4    | Listar alumno con paginacion   |
| POST     | /api/alumnos                         | Crear alumno                   |
| POST     | /api/alumnos/crear-con-foto          | Crear alumno con imagen        |
| PUT      | /api/alumnos/2                       | Actualizar alumno con imagen   |
