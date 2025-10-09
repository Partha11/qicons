package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.VideoCamera: ImageVector
    get() {
        if (_VideoCamera != null) {
            return _VideoCamera!!
        }
        _VideoCamera = ImageVector.Builder(
            name = "Outlined.VideoCamera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(15.75f, 10.5f)
                lineToRelative(4.72f, -4.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.28f, 0.53f)
                verticalLineToRelative(11.38f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, 0.53f)
                lineToRelative(-4.72f, -4.72f)
                moveTo(4.5f, 18.75f)
                horizontalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineToRelative(-9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                horizontalLineToRelative(-9f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 7.5f)
                verticalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                close()
            }
        }.build()

        return _VideoCamera!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCamera: ImageVector? = null
