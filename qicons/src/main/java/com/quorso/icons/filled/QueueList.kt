package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.QueueList: ImageVector
    get() {
        if (_QueueList != null) {
            return _QueueList!!
        }
        _QueueList = ImageVector.Builder(
            name = "Filled.QueueList",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.625f, 3.75f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 5.25f)
                horizontalLineToRelative(12.75f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.25f)
                horizontalLineTo(5.625f)
                close()
                moveTo(3.75f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(3.75f)
                close()
                moveTo(3f, 15.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
                moveTo(3.75f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(3.75f)
                close()
            }
        }.build()

        return _QueueList!!
    }

@Suppress("ObjectPropertyName")
private var _QueueList: ImageVector? = null
