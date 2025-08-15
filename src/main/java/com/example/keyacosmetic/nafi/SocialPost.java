import java.time.LocalDateTime;

    public class SocialPost {
        private String platform;
        private String content;
        private String imagePath;
        private LocalDateTime scheduledTime;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public LocalDateTime getScheduledTime() {
            return scheduledTime;
        }

        public void setScheduledTime(LocalDateTime scheduledTime) {
            this.scheduledTime = scheduledTime;
        }

        public SocialPost(String platform, String content, String imagePath, LocalDateTime scheduledTime) {
            this.platform = platform;
            this.content = content;
            this.imagePath = imagePath;
            this.scheduledTime = scheduledTime;

        }
    }
