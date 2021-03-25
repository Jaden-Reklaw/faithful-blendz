-- Added Test account for logging in during development
-- Use email for username and abc123 for password
-- Remove in prod

INSERT INTO USERS (ID, EMAIL, EMAIL_VERIFIED, IMAGE_URL, NAME, PASSWORD, PROVIDER, PROVIDER_ID)
VALUES (1, 'test@example.com', FALSE, 'https://cdn1.iconfinder.com/data/icons/avatars-55/100/avatar_profile_user_music_headphones_shirt_cool-512.png', 'test',
        '$2a$10$ogJIMeUMsI0CtELnreg5U.s0L6PoCy0D2bDfyyLrYm/9SfkUehUHW', 'local', null);