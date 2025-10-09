package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.VideoCameraSlash: ImageVector
    get() {
        if (_VideoCameraSlash != null) {
            return _VideoCameraSlash!!
        }
        _VideoCameraSlash = ImageVector.Builder(
            name = "Outlined.VideoCameraSlash",
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
                moveTo(12f, 18.75f)
                horizontalLineTo(4.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, -2.25f)
                verticalLineTo(9f)
                moveToRelative(12.841f, 9.091f)
                lineTo(16.5f, 19.5f)
                moveToRelative(-1.409f, -1.409f)
                curveToRelative(0.407f, -0.407f, 0.659f, -0.97f, 0.659f, -1.591f)
                verticalLineToRelative(-9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.621f, 0f, -1.184f, 0.252f, -1.591f, 0.659f)
                moveToRelative(12.182f, 12.182f)
                lineTo(2.909f, 5.909f)
                moveTo(1.5f, 4.5f)
                lineToRelative(1.409f, 1.409f)
            }
        }.build()

        return _VideoCameraSlash!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCameraSlash: ImageVector? = null
