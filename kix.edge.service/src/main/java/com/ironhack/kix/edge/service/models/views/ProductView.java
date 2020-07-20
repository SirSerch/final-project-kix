package com.ironhack.kix.edge.service.models.views;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class ProductView {
        private String productId;
        private String productName;
        private String productDescription;
        private BigDecimal productPrice;
        private Map<String, String> productTags;
        private GalleryView productImages;
        //Used by Search Engine
        private boolean isIndexed;
        private LocalDateTime createdTime;
        private LocalDateTime lastUpdateTime;
        private LocalDateTime lastIndexedTime;

        public ProductView() {
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductDescription() {
            return productDescription;
        }

        public void setProductDescription(String productDescription) {
            this.productDescription = productDescription;
        }

        public BigDecimal getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(BigDecimal productPrice) {
            this.productPrice = productPrice;
        }

        public Map<String, String> getProductTags() {
            return productTags;
        }

        public void setProductTags(Map<String, String> productTags) {
            this.productTags = productTags;
        }

        public GalleryView getProductImages() {
            return productImages;
        }

        public void setProductImages(GalleryView productImages) {
            this.productImages = productImages;
        }

        public boolean isIndexed() {
            return isIndexed;
        }

        public void setIndexed(boolean indexed) {
            isIndexed = indexed;
        }

        public LocalDateTime getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(LocalDateTime createdTime) {
            this.createdTime = createdTime;
        }

        public LocalDateTime getLastUpdateTime() {
            return lastUpdateTime;
        }

        public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public LocalDateTime getLastIndexedTime() {
            return lastIndexedTime;
        }

        public void setLastIndexedTime(LocalDateTime lastIndexedTime) {
            this.lastIndexedTime = lastIndexedTime;
        }
}
