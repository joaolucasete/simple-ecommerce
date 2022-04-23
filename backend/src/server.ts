import express from 'express';

import { Router, Request, Response } from 'express';
import cors from 'cors';

const app = express();

const route = Router();

app.use(express.json());
app.use(cors());

route.get('/', (req: Request, res: Response) => {
    res.json({ message: 'Welcome to simple ecommerce' });
})

app.use(route);

app.listen(3333, () => console.log('server running on port 3333'));