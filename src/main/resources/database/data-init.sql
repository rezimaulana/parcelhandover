ALTER TABLE distributions ALTER COLUMN is_active SET DEFAULT true;
ALTER TABLE distributions ALTER COLUMN ver SET DEFAULT 0;
ALTER TABLE handover_dtl ALTER COLUMN is_active SET DEFAULT true;
ALTER TABLE handover_dtl ALTER COLUMN ver SET DEFAULT 0;
ALTER TABLE handover_hdr ALTER COLUMN is_active SET DEFAULT true;
ALTER TABLE handover_hdr ALTER COLUMN ver SET DEFAULT 0;
ALTER TABLE roles ALTER COLUMN is_active SET DEFAULT true;
ALTER TABLE roles ALTER COLUMN ver SET DEFAULT 0;
ALTER TABLE user_vehicle ALTER COLUMN is_active SET DEFAULT true;
ALTER TABLE user_vehicle ALTER COLUMN ver SET DEFAULT 0;
ALTER TABLE users ALTER COLUMN is_active SET DEFAULT true;
ALTER TABLE users ALTER COLUMN ver SET DEFAULT 0;
ALTER TABLE vehicles ALTER COLUMN is_active SET DEFAULT true;
ALTER TABLE vehicles ALTER COLUMN ver SET DEFAULT 0;
ALTER TABLE warehouses ALTER COLUMN is_active SET DEFAULT true;
ALTER TABLE warehouses  ALTER COLUMN ver SET DEFAULT 0;

INSERT INTO roles (id, code, name, created_by, created_at) VALUES
('7b9d641a-66a0-4015-b663-65f5825f3314', 'RLSYS', 'System', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('d94a8f11-ae2b-40e2-aeca-c928dff44b89', 'RLSTF', 'Staff', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('99765066-8689-49d3-a867-63776fa38838', 'RLDVD', 'Driver', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now());

INSERT INTO users (id, code, fullname, role_id, created_by, created_at) VALUES
('846b92a3-d694-4ca1-a01e-7879ca1887f1', 'NXP-1111', 'System', '7b9d641a-66a0-4015-b663-65f5825f3314', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('34924351-7d39-4a7a-a359-e96cb84f78cc', 'NXP-3030', 'Maulana Rezi', 'd94a8f11-ae2b-40e2-aeca-c928dff44b89', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('4612287d-84ce-48ce-ba3f-7edc2af36820', 'NXP-1001', 'Abdul Saepudin', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('d6a79d47-6405-47a8-aae3-6ba12d50c2d0', 'NXP-1002', 'Ade Juliawan', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('ca78a409-1c5c-437c-ba33-0ea721250e62', 'NXP-1003', 'Agus Caca', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('888e748b-12be-4525-8ca5-70650f40bb7a', 'NXP-1004', 'Asep Zaenawan', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('c2987008-3e12-4428-8823-8b3acd848f19', 'NXP-1005', 'Attorik Tiar P', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('3b609350-9cc4-4553-97a2-c89a74886b9e', 'NXP-1006', 'Ayi Hendi', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('ef95c60b-5477-4420-8eb7-98ac6e102e18', 'NXP-1007', 'Cecep Somantri', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('4c9c1943-8d88-4212-ad97-704a8ce3d3ef', 'NXP-1008', 'Dadang Ramdani', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('cd0329f2-0c89-4e02-94bc-6962e74c40d3', 'NXP-1009', 'Dadi Kusnadi', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('3c6f3eb2-387e-4b55-8644-6c9579130e15', 'NXP-1010', 'Dapit Yuniar', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('315c95e1-3517-4766-880a-43ae80fde37a', 'NXP-1011', 'Dede Rohmat', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('8c61e0ea-4f4b-4727-94a6-8f62523f522c', 'NXP-1012', 'Dinar Akhbar N', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('aec467ba-e18c-476a-9fa7-99ef19b8fa1f', 'NXP-1013', 'Hendra Santani', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('553cf453-d71f-4ef2-82a7-2cfddc4919cd', 'NXP-1014', 'Heri Shandy', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('86881f50-622d-4afc-adea-47b5bcbb415a', 'NXP-1015', 'Irfan Hamdani', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('c567ae4f-b3cf-4b36-9adf-435c1b6d5e8d', 'NXP-1016', 'Imam Hadi', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('7f4e1ffd-21ed-4898-9cb1-ca1da71a3249', 'NXP-1017', 'Mochamad Iqbal Harris', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('a49a43b3-ff05-4489-b2ed-d30f51b1cc35', 'NXP-1018', 'Muhammad Afrizal', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('83ba32c4-b598-4e60-a21b-b6ffd4206fb6', 'NXP-1019', 'Nandang Saepudin', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('c5bb8d08-5db3-410a-a206-fc1a9015bcce', 'NXP-1020', 'Nurramdani', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('f22566bc-6463-4930-a39d-ed04620d6c59', 'NXP-1021', 'Raden Ryan', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('071ed133-39c3-49ff-abb5-10023e793ace', 'NXP-1022', 'Riky Kurnia Putra', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('99303bd9-5d87-4e6d-901e-c9b421f822b7', 'NXP-1023', 'Rojak Hindarsyah', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('2eb35e29-a48d-4fa8-93e1-c45c54ba512c', 'NXP-1024', 'Tommy Yanuar', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('ace69c35-29b3-448b-b546-bf31f1ad4959', 'NXP-1025', 'Yayat Nurkayat', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('6e4ffb39-a2c3-4e9e-8369-0871687e7da3', 'NXP-1026', 'Yudi Tris Trianto', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now()),
('4dd432bf-9fab-4fdf-b3a9-f5ab1c54eb92', 'NXP-1027', 'Zamzam Juansah', '99765066-8689-49d3-a867-63776fa38838', '846b92a3-d694-4ca1-a01e-7879ca1887f1', now());

INSERT INTO vehicles(id, vehicle_plate, vehicle_model, year_making, manufacture, created_by, created_at) VALUES
('8c2ce04c-b5ff-44b5-88db-c17741072c10', 'D 8459 FK', 'Traga', '2023', 'Isuzu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('957f7f21-2205-445d-a534-94d9ce0fe56e', 'D 8455 FK', 'Colt Diesel Double', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('fb0d780e-0d51-4d51-b208-4e60ee3c95e9', 'D 8458 FK', 'Colt Diesel Engkel', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('bee374a0-6873-4962-94b8-3108facbd85b', 'D 8462 FK', 'Fuso', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('f4997b6f-2714-4d74-8f68-674b43a8f513', 'D 8907 EX', 'Trailer', '2023', 'Isuzu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('bb4667c2-9297-40bb-96c9-a47a66dfe81c', 'B 9847 NCE', 'Blind Van', '2023', 'Daihatsu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('ec9ade45-5259-4a11-a310-5d48d69979bd', 'B 9764 NCH', 'Van Box', '2023', 'Daihatsu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('7345aa26-aced-4317-9365-132706c16b98', 'B 9842 FCE', 'L300', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('a089dd0f-44c1-4bfd-8d09-019fc6d7f035', 'D 8454 FK', 'Traga', '2023', 'Isuzu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('5559e7b4-f61b-4c73-8c73-222fe12a73af', 'D 8457 FK', 'Colt Diesel Double', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('7a0c18ed-5460-47b2-a5e5-a62428782d34', 'D 8461 FK', 'Colt Diesel Engkel', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('d0f1519b-674e-4947-ba94-dd58f21ebce7', 'B 9603 FCE', 'Fuso', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('c4f030cb-5bfd-4250-8eb0-c9f4ce628f79', 'E 9253 AC', 'Trailer', '2023', 'Isuzu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('264ccb41-b327-4ebe-be06-af0dc4065e28', 'B 9800 FCE', 'Blind Van', '2023', 'Daihatsu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('4097e359-03fc-4fb3-b053-0fad4b464675', 'D 8456 FK', 'Van Box', '2023', 'Daihatsu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('0205d967-f57a-4b32-a685-f886b1ae65b2', 'D 8295 EY', 'L300', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('d895f3f4-cba3-427f-b1c7-4b72cb5f41b7', 'B 9301 BCT', 'Traga', '2023', 'Isuzu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('0fa5354c-f3a3-4d52-833b-10e6e4af488a', 'B 9852 NCE', 'Colt Diesel Double', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('273f7d4f-ed31-4af0-a9d9-ab650650720d', 'B 9325 FCE', 'Colt Diesel Engkel', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('896f7d05-98ca-4e77-aa8c-3ef7db734109', 'B 9309 NCI', 'Fuso', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('9bdd95b1-25ba-4817-87cb-bef0332e2aee', 'B 9863 NCE', 'Trailer', '2023', 'Isuzu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('7bb04989-8da2-4ac3-bb1f-6d1c1a778c34', 'D 8382 FH', 'Blind Van', '2023', 'Daihatsu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('c0b4b3bf-1429-4aab-96e5-eb5df40b4016', 'B 9745 NCH', 'Van Box', '2023', 'Daihatsu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('6b3f0a04-2b05-42d3-a938-ccc2f8c1d505', 'E 9304 AC', 'L300', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('12720ffd-2aea-4ae4-9783-c5a0bd261964', 'D 8481 FM', 'Traga', '2023', 'Isuzu', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('3c6e1f99-aa01-4371-98f9-29c41f7e0946', 'D 8495 FM', 'Colt Diesel Double', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('b512aee9-610c-438f-b8f3-c9a113d8ae4e', 'B 9885 NCE', 'Colt Diesel Engkel', '2023', 'Mitsubishi', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW());

INSERT INTO user_vehicle(user_id, vehicle_id, id, created_by, created_at) VALUES
('4612287d-84ce-48ce-ba3f-7edc2af36820', '8c2ce04c-b5ff-44b5-88db-c17741072c10', 'deb5558e-712b-414f-9211-4f38c06f46de', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('d6a79d47-6405-47a8-aae3-6ba12d50c2d0', '957f7f21-2205-445d-a534-94d9ce0fe56e', '004a1fce-adbb-4b47-80b9-f30ffe4b3152', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('ca78a409-1c5c-437c-ba33-0ea721250e62', 'fb0d780e-0d51-4d51-b208-4e60ee3c95e9', '3c3385ce-3a12-4dc7-a2bb-bb99a130de98', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('888e748b-12be-4525-8ca5-70650f40bb7a', 'bee374a0-6873-4962-94b8-3108facbd85b', '282a1e8b-101e-49c4-9eaa-556c2879b157', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('c2987008-3e12-4428-8823-8b3acd848f19', 'f4997b6f-2714-4d74-8f68-674b43a8f513', '3fd3df21-35bb-48a0-b846-1c97da83f3d5', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('3b609350-9cc4-4553-97a2-c89a74886b9e', 'bb4667c2-9297-40bb-96c9-a47a66dfe81c', '04aa697b-4784-459b-b5cf-d7b8128c24b7', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('ef95c60b-5477-4420-8eb7-98ac6e102e18', 'ec9ade45-5259-4a11-a310-5d48d69979bd', '84b54454-43bc-4ecb-9514-ca8f298b2575', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('4c9c1943-8d88-4212-ad97-704a8ce3d3ef', '7345aa26-aced-4317-9365-132706c16b98', 'ec56a4a1-d96b-4875-826e-c5077e8b5434', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('cd0329f2-0c89-4e02-94bc-6962e74c40d3', 'a089dd0f-44c1-4bfd-8d09-019fc6d7f035', 'fca4ecdd-67bf-4997-8599-4c3ceff1e112', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('3c6f3eb2-387e-4b55-8644-6c9579130e15', '5559e7b4-f61b-4c73-8c73-222fe12a73af', '06198cd3-2185-46a5-8e03-32a717e1c835', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('315c95e1-3517-4766-880a-43ae80fde37a', '7a0c18ed-5460-47b2-a5e5-a62428782d34', '1b76e933-3c9b-4cde-99b8-a4b5c52c7f49', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('8c61e0ea-4f4b-4727-94a6-8f62523f522c', 'd0f1519b-674e-4947-ba94-dd58f21ebce7', '85892a68-e97e-4e2a-aed7-34af2ccb1a12', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('aec467ba-e18c-476a-9fa7-99ef19b8fa1f', 'c4f030cb-5bfd-4250-8eb0-c9f4ce628f79', '9cef34c8-f417-43c8-94db-1c818923ce97', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('553cf453-d71f-4ef2-82a7-2cfddc4919cd', '264ccb41-b327-4ebe-be06-af0dc4065e28', '30c2b9bb-243f-48ab-b260-d5c26d56cbd3', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('86881f50-622d-4afc-adea-47b5bcbb415a', '4097e359-03fc-4fb3-b053-0fad4b464675', '2199583d-e725-4683-b61b-9d359e684f61', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('c567ae4f-b3cf-4b36-9adf-435c1b6d5e8d', '0205d967-f57a-4b32-a685-f886b1ae65b2', '5fc3ee31-5795-4ec4-97bf-f792c1a8a348', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('7f4e1ffd-21ed-4898-9cb1-ca1da71a3249', 'd895f3f4-cba3-427f-b1c7-4b72cb5f41b7', '8d4efdde-2fe3-4a87-96a3-e9ff58b541c3', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('a49a43b3-ff05-4489-b2ed-d30f51b1cc35', '0fa5354c-f3a3-4d52-833b-10e6e4af488a', '5e3897f2-b649-4b47-bb4f-f5a686cfc7eb', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('83ba32c4-b598-4e60-a21b-b6ffd4206fb6', '273f7d4f-ed31-4af0-a9d9-ab650650720d', '27116da9-bc93-4e06-b964-44a83d87506b', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('c5bb8d08-5db3-410a-a206-fc1a9015bcce', '896f7d05-98ca-4e77-aa8c-3ef7db734109', 'b36852e5-6306-4e31-9257-eec82f16975b', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('f22566bc-6463-4930-a39d-ed04620d6c59', '9bdd95b1-25ba-4817-87cb-bef0332e2aee', '595fb1c8-7df6-4ac6-a6a6-fcf607c9bf8d', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('071ed133-39c3-49ff-abb5-10023e793ace', '7bb04989-8da2-4ac3-bb1f-6d1c1a778c34', '6a77f7b6-9199-4210-856d-aac2bfb5e924', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('99303bd9-5d87-4e6d-901e-c9b421f822b7', 'c0b4b3bf-1429-4aab-96e5-eb5df40b4016', '924ec50e-eb13-439e-b123-81d831a9152a', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('2eb35e29-a48d-4fa8-93e1-c45c54ba512c', '6b3f0a04-2b05-42d3-a938-ccc2f8c1d505', '99c8b972-baf8-4367-be8c-57738853c0c8', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('ace69c35-29b3-448b-b546-bf31f1ad4959', '12720ffd-2aea-4ae4-9783-c5a0bd261964', '2290721c-ce0b-4f93-b976-71cdc46e3386', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('6e4ffb39-a2c3-4e9e-8369-0871687e7da3', '3c6e1f99-aa01-4371-98f9-29c41f7e0946', '50168f86-fe2a-4f12-982d-df59930d7b81', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('4dd432bf-9fab-4fdf-b3a9-f5ab1c54eb92', 'b512aee9-610c-438f-b8f3-c9a113d8ae4e', '9094fab1-f890-4449-8e29-a037c5f26488', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW());

INSERT INTO warehouses (id, code, name, region, created_by, created_at) VALUES
('84b6f8ea-f107-4ea3-9514-482e74179f56', 'BDO-BDO', 'MSH Bandung', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('ba186f30-c9dc-4600-a88b-44eeb28c637a', 'LZD-STA', 'Laz Soetta Bandung', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('116bc37d-ede2-469d-a237-ae338549c8a9', 'BDO-BJA', 'Banjaran', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('fec59f62-2e08-4b02-b087-65521fd9fa0c', 'BDO-CWD', 'Ciwidey', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('7e57a5bb-ba93-4345-8ef1-d311177e7828', 'BDO-ARC', 'Arcamanik', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('a27bf9f6-71c7-46b5-a294-dbfe4d5bf973', 'BDO-DYT', 'Cibaduyut', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('804fb068-fa48-4d96-917d-eb6341720689', 'LZD-DKC', 'Laz Kutawaringin Bandung', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('6f71fd23-9f95-45d4-b7e9-0602348e3412', 'LZD-DRC', 'Laz Hegarmanah Bandung', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('ee204a41-8d07-42be-8a02-06becf681ce0', 'BDO-CBB', 'Cibabat', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('871f26b4-f721-4dbd-8474-f251767c8958', 'BDO-GNH', 'Gunung Halu', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW()),
('6bee5270-5d1f-4650-846f-17ca6b77a0b0', 'BDO-LKG', 'Lengkong', 'West Java 1', '846b92a3-d694-4ca1-a01e-7879ca1887f1', NOW());

ALTER TABLE distributions ALTER COLUMN is_active DROP DEFAULT;
ALTER TABLE distributions ALTER COLUMN ver DROP DEFAULT;
ALTER TABLE handover_dtl ALTER COLUMN is_active DROP DEFAULT;
ALTER TABLE handover_dtl ALTER COLUMN ver DROP DEFAULT;
ALTER TABLE handover_hdr ALTER COLUMN is_active DROP DEFAULT;
ALTER TABLE handover_hdr ALTER COLUMN ver DROP DEFAULT;
ALTER TABLE roles ALTER COLUMN is_active DROP DEFAULT;
ALTER TABLE roles ALTER COLUMN ver DROP DEFAULT;
ALTER TABLE user_vehicle ALTER COLUMN is_active DROP DEFAULT;
ALTER TABLE user_vehicle ALTER COLUMN ver DROP DEFAULT;
ALTER TABLE users ALTER COLUMN is_active DROP DEFAULT;
ALTER TABLE users ALTER COLUMN ver DROP DEFAULT;
ALTER TABLE vehicles ALTER COLUMN is_active DROP DEFAULT;
ALTER TABLE vehicles ALTER COLUMN ver DROP DEFAULT;
ALTER TABLE warehouses ALTER COLUMN is_active DROP DEFAULT;
ALTER TABLE warehouses ALTER COLUMN ver DROP DEFAULT;